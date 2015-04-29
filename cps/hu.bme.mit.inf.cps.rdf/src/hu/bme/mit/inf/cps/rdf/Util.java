package hu.bme.mit.inf.cps.rdf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Util
{
	public static String readFile(String path, Charset encoding)
			throws IOException
	{
		System.out.println(Paths.get(path).toUri().toString());
		byte[] encoded = Files.readAllBytes(Paths.get(path));

		return new String(encoded, encoding);
	};

	// 2014-05-28T00:00:00+01:00
	public static String getTimestamp()
	{
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));

		Calendar c = Calendar.getInstance();
		TimeZone z = c.getTimeZone();
		int offset = z.getRawOffset();
		if (z.inDaylightTime(date))
		{
			offset = offset + z.getDSTSavings();
		}
		int offsetHrs = offset / 1000 / 60 / 60;

		DecimalFormat formatter = new DecimalFormat("00");
		return (format.format(date) + "+" + formatter.format(offsetHrs) + ":00");
	}

	public static String stripTimestamp(String timestamp)
	{
		return timestamp.replaceAll(":", "-").replaceAll("\\+", "_");
	}
}

