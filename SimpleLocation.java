public class SimpleLocation
{
	public double latitude;
	public double longitude;

	public SimpleLocation(double lat, double lon)
	{
		this.latitude = lat;
		this.longitude = lon;
	}
	public SImpleLocation()
	{
		this.latitude = 32.9;
		this.longitude = -177.2;
	}
	
	public double distance(SimpleLocation other)
	{
		return getDist(this.latitude, this.longitude, other.latitude, other.longitude);
	}
	public double distance(double otherLat, double otherLon)
	{
		return getDist(this.latitude, this.longitude, otherLat, otherLon);
	}
}

public class LocationTester
{
	public static void main{
	SimpleLocation ucsd = new SimpleLocation(32.9, -117.2);
	SimpleLocation lima = new SimpleLocation(-12.0, -77.0);
	
	System.out.println uscd.distance(lima);
	}
}
