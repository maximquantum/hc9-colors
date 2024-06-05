package colors;

import java.util.Objects;

public class TransparentColor extends Color {

	public final int transparency;
	
	TransparentColor(int red, int green, int blue, int transparency) {
		super(red, green, blue);
		this.transparency = transparency;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && obj instanceof TransparentColor t && transparency == t.transparency; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), transparency);
	}
	
}
