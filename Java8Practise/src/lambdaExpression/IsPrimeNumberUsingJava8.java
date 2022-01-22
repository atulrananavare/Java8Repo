package lambdaExpression;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.stream.IntStream;

public class IsPrimeNumberUsingJava8 {

	public static void main(String[] args) {
		
		int number=7;
		
		System.out.println(IntStream.range(2, number).noneMatch(n->number%n==0));
		
		//Starting with an java.time.Instant value
	    Instant timeStamp= Instant.now();
	    System.out.println("Machine Time Now:" + timeStamp);
	 
	    //timeStamp in zone - "America/Los_Angeles"
	    ZonedDateTime LAZone= timeStamp.atZone(ZoneId.of("America/Los_Angeles"));
	    System.out.println("In Los Angeles(America) Time Zone:"+ LAZone);
	 
	    //timeStamp in zone - "GMT+01:00"
	    ZonedDateTime timestampAtGMTPlus1= timeStamp.atZone(ZoneId.of("GMT+01:00"));
	    System.out.println("In 'GMT+01:00' Time Zone:"+ timestampAtGMTPlus1);
	

	}

}
