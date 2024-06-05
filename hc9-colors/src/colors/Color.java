package colors;

import java.util.Objects;

public class Color {

	public final int red, green, blue;
	
	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getHue() { return 0; }
	public int getSaturation() { return 0; }
	public int getValue() { return 0; }

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Color c && red == c.red && green == c.green && blue == c.blue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(red, green, blue);
	}

	@Override
	public String toString() {
		return "Color[red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
}
