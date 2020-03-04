package enums;
enum Directions{
	NORTH,
	EAST,
	WEST,
	SOUTH
}

public class EnumDemo {
	public static void main (String ars[])
	{
		Directions directions =Directions.NORTH;
		switch(directions)
		{
		case NORTH : if (directions == Directions.NORTH) {
				System.out.print("Direction : NORTH");
				}
				break;
		case EAST : if (directions == Directions.EAST) {
			System.out.print("Direction : EAST");
			}
			break;
		case WEST : if (directions == Directions.WEST) {
			System.out.print("Direction : WEST");
			}
			break;
		case SOUTH : if (directions == Directions.SOUTH) {
			System.out.print("Direction : SOUNTH");
			}
			break;
		default : System.out.println("not matching");
		}
	}


}