package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("fitness")) {
	    return "The FitnessGram Pacer Test is a multistage aerobic capacity test that progressively gets more difficult as it continues. The 20 meter pacer test will begin in 30 seconds. Line up at the start. The running speed starts slowly, but gets faster each minute after you hear this signal. [beep] A single lap should be completed each time you hear this sound. [ding] Remember to run in a straight line, and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on the word start. On your mark, get ready, start.";
	} else if (query.toLowerCase().contains("what is your name")) {
	    return "jpcisp";
	}
	else if (query.toLowerCase().contains(" is the largest")) {
		String[] q = query.split(":");
		String[] nums = q[1].split(",");
		int max = 0;
		for (String n : nums) {
			if (Integer.parseInt(n) > max) max = Integer.parseInt(n);
		}
		return max + "";
	}
        return "";
    }
}
