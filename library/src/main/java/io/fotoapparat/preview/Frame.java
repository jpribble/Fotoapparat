package io.fotoapparat.preview;

import java.util.Arrays;

/**
 * Frame of the preview stream.
 */
public class Frame {

	/**
	 * Image in NV21 format.
	 */
	public final byte[] image;

	/**
	 * Clockwise rotation of the image in degrees relatively to user.
	 */
	public final int rotation;

	public Frame(byte[] image, int rotation) {
		this.image = image;
		this.rotation = rotation;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Frame frame = (Frame) o;

		return rotation == frame.rotation && Arrays.equals(image, frame.image);

	}

	@Override
	public int hashCode() {
		int result = Arrays.hashCode(image);
		result = 31 * result + rotation;
		return result;
	}
}
