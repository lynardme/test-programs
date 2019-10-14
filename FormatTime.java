package biomatters;

import java.util.concurrent.TimeUnit;

class FormatTime {

	static String formatTime(int millis) {
		// long minutes = (milliseconds / 1000) / 60;
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);

		// long seconds = (milliseconds / 1000);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);

//		System.out.println(minutes);
//		System.out.println(Math.round(seconds*100.0)/100.0);
        return Long.toString(minutes) + ":" + Long.toString(seconds);  // TODO
	}

	// Examples
	public static void main(String[] args) {
		System.out.println(FormatTime.formatTime(1000000));
//        System.out.println("test1: "+("0:00".equals(formatTime(0))?"pass":"fail"));
//		System.out.println("test2: "+("0:00".equals(formatTime(999))?"pass":"fail"));
//		System.out.println("test3: "+("0:01".equals(formatTime(1000))?"pass":"fail"));
//		System.out.println("test4: "+("1:00".equals(formatTime(60000))?"pass":"fail"));
//		System.out.println("test5: "+("22:10".equals(formatTime(1330001))?"pass":"fail"));
//		System.out.println("test6: "+("61:00".equals(formatTime(3660000))?"pass":"fail"));
//		System.out.println("test7: "+("2880:00".equals(formatTime(172800000))?"pass":"fail"));
	}
}