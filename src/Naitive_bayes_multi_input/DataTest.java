package Naitive_bayes_multi_input;

public class DataTest {
	public static String[][] CARTEST = {
			{"buying",	"maint",	"doors",	"persons",	"lug_boot",	"safety"},
			{"vhigh",	"med",	"3Doors",	"morePerson",	"small",	"high"},
			{"low",	"vhigh",	"5Doors",	"morePerson",	"big",	"low"},
			{"low",	"high",	"2Doors",	"2Persons",	"big",	"med"},
			{"vhigh",	"med",	"3Doors",	"2Persons",	"med",	"med"},
			{"high",	"vhigh",	"3Doors",	"4Persons",	"med",	"high"},
			{"high",	"vhigh",	"3Doors",	"morePerson",	"big",	"low"},
			{"high",	"low",	"5Doors",	"4Persons",	"big",	"med"},
			{"low",	"med",	"4Doors",	"2Persons",	"big",	"med"},
			{"low",	"vhigh",	"2Doors",	"2Persons",	"big",	"med"},
			{"med",	"low",	"4Doors",	"morePerson",	"med",	"high"},
			{"low",	"low",	"3Doors",	"morePerson",	"big",	"med"},
			{"med",	"vhigh",	"3Doors",	"morePerson",	"med",	"high"},
			{"high",	"vhigh",	"4Doors",	"2Persons",	"small",	"low"},
			{"low",	"low",	"5Doors",	"morePerson",	"small",	"med"},
			{"vhigh",	"high",	"4Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"med",	"5Doors",	"4Persons",	"med",	"med"},
			{"high",	"vhigh",	"3Doors",	"4Persons",	"small",	"med"},
			{"med",	"high",	"2Doors",	"4Persons",	"med",	"low"},
			{"high",	"low",	"2Doors",	"4Persons",	"med",	"med"},
			{"high",	"high",	"2Doors",	"morePerson",	"big",	"low"},
			{"low",	"high",	"3Doors",	"2Persons",	"big",	"high"},
			{"vhigh",	"low",	"4Doors",	"morePerson",	"big",	"low"},
			{"vhigh",	"vhigh",	"3Doors",	"2Persons",	"big",	"high"},
			{"low",	"high",	"2Doors",	"morePerson",	"small",	"med"},
			{"med",	"high",	"2Doors",	"2Persons",	"big",	"med"},
			{"high",	"med",	"3Doors",	"4Persons",	"small",	"low"},
			{"vhigh",	"med",	"5Doors",	"2Persons",	"big",	"high"},
			{"med",	"vhigh",	"2Doors",	"4Persons",	"small",	"med"},
			{"high",	"low",	"3Doors",	"morePerson",	"small",	"high"},
			{"high",	"med",	"5Doors",	"morePerson",	"big",	"med"},
			{"low",	"high",	"3Doors",	"2Persons",	"small",	"low"},
			{"high",	"low",	"4Doors",	"2Persons",	"med",	"med"},
			{"med",	"vhigh",	"3Doors",	"2Persons",	"big",	"high"},
			{"vhigh",	"low",	"3Doors",	"4Persons",	"med",	"med"},
			{"high",	"low",	"5Doors",	"4Persons",	"big",	"low"},
			{"vhigh",	"vhigh",	"5Doors",	"2Persons",	"small",	"med"},
			{"high",	"high",	"2Doors",	"morePerson",	"small",	"high"},
			{"low",	"high",	"5Doors",	"2Persons",	"big",	"low"},
			{"low",	"low",	"2Doors",	"4Persons",	"med",	"med"},
			{"low",	"low",	"4Doors",	"morePerson",	"big",	"low"},
			{"low",	"high",	"2Doors",	"2Persons",	"small",	"med"},
			{"high",	"med",	"5Doors",	"morePerson",	"med",	"high"},
			{"high",	"vhigh",	"2Doors",	"4Persons",	"big",	"med"},
			{"vhigh",	"vhigh",	"2Doors",	"morePerson",	"small",	"high"},
			{"vhigh",	"vhigh",	"5Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"low",	"4Doors",	"morePerson",	"med",	"high"},
			{"high",	"vhigh",	"4Doors",	"2Persons",	"small",	"med"},
			{"vhigh",	"low",	"4Doors",	"4Persons",	"med",	"low"},
			{"med",	"high",	"5Doors",	"morePerson",	"med",	"low"},
			{"vhigh",	"low",	"5Doors",	"4Persons",	"med",	"low"},
			{"low",	"med",	"2Doors",	"2Persons",	"small",	"low"},
			{"med",	"med",	"3Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"high",	"4Doors",	"2Persons",	"big",	"med"},
			{"med",	"low",	"2Doors",	"morePerson",	"big",	"high"},
			{"vhigh",	"vhigh",	"2Doors",	"4Persons",	"small",	"low"},
			{"high",	"med",	"5Doors",	"morePerson",	"big",	"low"},
			{"low",	"low",	"2Doors",	"morePerson",	"small",	"low"},
			{"low",	"vhigh",	"5Doors",	"morePerson",	"med",	"low"},
			{"med",	"vhigh",	"2Doors",	"4Persons",	"big",	"med"},
			{"high",	"high",	"4Doors",	"4Persons",	"small",	"high"},
			{"low",	"high",	"4Doors",	"morePerson",	"big",	"low"},
			{"low",	"vhigh",	"4Doors",	"morePerson",	"small",	"low"},
			{"high",	"high",	"5Doors",	"2Persons",	"big",	"high"},
			{"med",	"med",	"3Doors",	"morePerson",	"med",	"high"},
			{"med",	"low",	"4Doors",	"2Persons",	"big",	"low"},
			{"high",	"med",	"4Doors",	"4Persons",	"small",	"high"},
			{"med",	"low",	"5Doors",	"4Persons",	"big",	"high"},
			{"high",	"vhigh",	"4Doors",	"morePerson",	"big",	"high"},
			{"med",	"med",	"3Doors",	"4Persons",	"med",	"low"},
			{"med",	"low",	"4Doors",	"4Persons",	"big",	"med"},
			{"vhigh",	"vhigh",	"2Doors",	"4Persons",	"med",	"high"},
			{"low",	"low",	"3Doors",	"morePerson",	"small",	"high"},
			{"vhigh",	"med",	"3Doors",	"morePerson",	"med",	"med"},
			{"high",	"high",	"2Doors",	"morePerson",	"med",	"med"},
			{"med",	"low",	"5Doors",	"morePerson",	"med",	"low"},
			{"vhigh",	"vhigh",	"2Doors",	"4Persons",	"med",	"med"},
			{"high",	"low",	"3Doors",	"4Persons",	"med",	"low"},
			{"high",	"high",	"3Doors",	"4Persons",	"big",	"high"},
			{"med",	"med",	"4Doors",	"2Persons",	"small",	"high"},
			{"high",	"high",	"4Doors",	"4Persons",	"big",	"high"},
			{"vhigh",	"low",	"4Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"low",	"3Doors",	"2Persons",	"small",	"med"},
			{"high",	"high",	"4Doors",	"2Persons",	"med",	"low"},
			{"vhigh",	"vhigh",	"4Doors",	"morePerson",	"big",	"low"},
			{"vhigh",	"low",	"5Doors",	"2Persons",	"small",	"med"},
			{"low",	"low",	"5Doors",	"4Persons",	"big",	"low"},
			{"low",	"high",	"4Doors",	"morePerson",	"small",	"high"},
			{"low",	"med",	"2Doors",	"morePerson",	"med",	"high"},
			{"vhigh",	"high",	"5Doors",	"4Persons",	"med",	"high"},
			{"low",	"high",	"5Doors",	"morePerson",	"med",	"low"},
			{"high",	"high",	"4Doors",	"morePerson",	"small",	"high"},
			{"high",	"high",	"3Doors",	"2Persons",	"big",	"high"},
			{"med",	"vhigh",	"2Doors",	"morePerson",	"small",	"med"},
			{"med",	"low",	"3Doors",	"morePerson",	"med",	"low"},
			{"high",	"med",	"2Doors",	"morePerson",	"med",	"high"},
			{"med",	"vhigh",	"4Doors",	"2Persons",	"small",	"low"},
			{"high",	"med",	"3Doors",	"2Persons",	"med",	"low"},
			{"med",	"vhigh",	"5Doors",	"2Persons",	"small",	"med"},
			{"low",	"med",	"2Doors",	"4Persons",	"big",	"low"},
			{"med",	"low",	"2Doors",	"morePerson",	"med",	"high"},
			{"med",	"vhigh",	"3Doors",	"2Persons",	"med",	"high"},
			{"high",	"med",	"3Doors",	"morePerson",	"big",	"med"},
			{"high",	"vhigh",	"2Doors",	"4Persons",	"med",	"high"},
			{"high",	"med",	"3Doors",	"morePerson",	"med",	"high"},
			{"high",	"med",	"5Doors",	"2Persons",	"small",	"med"},
			{"med",	"vhigh",	"3Doors",	"morePerson",	"big",	"high"},
			{"high",	"low",	"4Doors",	"morePerson",	"small",	"high"},
			{"vhigh",	"high",	"2Doors",	"4Persons",	"small",	"med"},
			{"high",	"low",	"3Doors",	"4Persons",	"big",	"high"},
			{"low",	"vhigh",	"3Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"high",	"4Doors",	"4Persons",	"med",	"med"},
			{"high",	"low",	"2Doors",	"morePerson",	"small",	"high"},
			{"high",	"med",	"5Doors",	"morePerson",	"small",	"low"},
			{"vhigh",	"vhigh",	"4Doors",	"morePerson",	"small",	"low"},
			{"med",	"low",	"2Doors",	"2Persons",	"big",	"low"},
			{"high",	"high",	"3Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"vhigh",	"4Doors",	"4Persons",	"med",	"low"},
			{"med",	"low",	"4Doors",	"morePerson",	"small",	"high"},
			{"vhigh",	"vhigh",	"3Doors",	"4Persons",	"big",	"high"},
			{"med",	"vhigh",	"2Doors",	"4Persons",	"big",	"high"},
			{"med",	"low",	"3Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"high",	"2Doors",	"4Persons",	"med",	"med"},
			{"med",	"high",	"4Doors",	"4Persons",	"med",	"high"},
			{"high",	"vhigh",	"4Doors",	"2Persons",	"med",	"med"},
			{"high",	"low",	"5Doors",	"morePerson",	"small",	"low"},
			{"med",	"med",	"3Doors",	"morePerson",	"small",	"high"},
			{"vhigh",	"med",	"4Doors",	"4Persons",	"small",	"low"},
			{"med",	"vhigh",	"2Doors",	"morePerson",	"med",	"low"},
			{"med",	"high",	"4Doors",	"morePerson",	"small",	"high"},
			{"vhigh",	"med",	"5Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"med",	"5Doors",	"morePerson",	"med",	"med"},
			{"med",	"med",	"4Doors",	"4Persons",	"med",	"high"},
			{"low",	"high",	"4Doors",	"2Persons",	"med",	"high"},
			{"low",	"med",	"2Doors",	"morePerson",	"small",	"med"},
			{"high",	"high",	"2Doors",	"4Persons",	"small",	"low"},
			{"low",	"low",	"5Doors",	"morePerson",	"small",	"high"},
			{"high",	"med",	"4Doors",	"morePerson",	"small",	"low"},
			{"low",	"med",	"4Doors",	"4Persons",	"small",	"low"},
			{"vhigh",	"vhigh",	"4Doors",	"morePerson",	"small",	"med"},
			{"low",	"med",	"5Doors",	"4Persons",	"small",	"med"},
			{"vhigh",	"high",	"3Doors",	"2Persons",	"big",	"high"},
			{"med",	"vhigh",	"5Doors",	"2Persons",	"big",	"high"},
			{"high",	"med",	"2Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"high",	"4Doors",	"2Persons",	"med",	"med"},
			{"high",	"vhigh",	"2Doors",	"morePerson",	"med",	"low"},
			{"low",	"low",	"2Doors",	"2Persons",	"med",	"high"},
			{"vhigh",	"high",	"4Doors",	"4Persons",	"med",	"low"},
			{"high",	"high",	"2Doors",	"2Persons",	"small",	"med"},
			{"high",	"high",	"2Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"high",	"3Doors",	"4Persons",	"small",	"low"},
			{"med",	"high",	"4Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"vhigh",	"5Doors",	"4Persons",	"med",	"low"},
			{"med",	"low",	"4Doors",	"4Persons",	"med",	"high"},
			{"low",	"low",	"2Doors",	"morePerson",	"small",	"med"},
			{"med",	"med",	"4Doors",	"4Persons",	"med",	"med"},
			{"med",	"high",	"5Doors",	"morePerson",	"small",	"med"},
			{"vhigh",	"vhigh",	"2Doors",	"2Persons",	"big",	"high"},
			{"high",	"med",	"3Doors",	"morePerson",	"med",	"med"},
			{"low",	"high",	"3Doors",	"4Persons",	"small",	"med"},
			{"high",	"vhigh",	"5Doors",	"4Persons",	"small",	"high"},
			{"med",	"vhigh",	"2Doors",	"2Persons",	"big",	"low"},
			{"high",	"low",	"2Doors",	"2Persons",	"small",	"high"},
			{"high",	"med",	"2Doors",	"2Persons",	"big",	"med"},
			{"high",	"low",	"4Doors",	"4Persons",	"small",	"high"},
			{"med",	"vhigh",	"2Doors",	"morePerson",	"big",	"high"},
			{"vhigh",	"med",	"4Doors",	"morePerson",	"med",	"high"},
			{"low",	"med",	"2Doors",	"morePerson",	"big",	"low"},
			{"vhigh",	"med",	"3Doors",	"2Persons",	"big",	"high"},
			{"high",	"vhigh",	"3Doors",	"morePerson",	"small",	"med"},
			{"med",	"vhigh",	"2Doors",	"4Persons",	"med",	"med"},
			{"low",	"low",	"2Doors",	"2Persons",	"big",	"high"},
			{"high",	"low",	"4Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"high",	"3Doors",	"2Persons",	"med",	"med"},
			{"vhigh",	"high",	"4Doors",	"2Persons",	"med",	"low"},
			{"med",	"high",	"4Doors",	"morePerson",	"med",	"high"},
			{"med",	"low",	"3Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"high",	"4Doors",	"morePerson",	"small",	"low"},
			{"high",	"med",	"4Doors",	"4Persons",	"small",	"low"},
			{"med",	"low",	"4Doors",	"morePerson",	"big",	"low"},
			{"med",	"med",	"4Doors",	"4Persons",	"small",	"high"},
			{"low",	"vhigh",	"2Doors",	"2Persons",	"small",	"high"},
			{"vhigh",	"med",	"2Doors",	"4Persons",	"med",	"low"},
			{"vhigh",	"low",	"3Doors",	"4Persons",	"med",	"high"},
			{"med",	"vhigh",	"5Doors",	"2Persons",	"med",	"low"},
			{"low",	"high",	"3Doors",	"4Persons",	"big",	"low"},
			{"med",	"low",	"2Doors",	"morePerson",	"med",	"med"},
			{"med",	"vhigh",	"2Doors",	"morePerson",	"med",	"high"},
			{"med",	"high",	"5Doors",	"morePerson",	"big",	"med"},
			{"low",	"low",	"4Doors",	"4Persons",	"small",	"low"},
			{"high",	"high",	"3Doors",	"2Persons",	"small",	"high"},
			{"med",	"low",	"3Doors",	"morePerson",	"med",	"high"},
			{"vhigh",	"low",	"3Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"high",	"5Doors",	"2Persons",	"big",	"med"},
			{"high",	"med",	"5Doors",	"morePerson",	"small",	"med"},
			{"high",	"vhigh",	"3Doors",	"2Persons",	"big",	"med"},
			{"low",	"med",	"5Doors",	"morePerson",	"small",	"high"},
			{"med",	"med",	"2Doors",	"4Persons",	"med",	"high"},
			{"med",	"vhigh",	"2Doors",	"4Persons",	"small",	"high"},
			{"high",	"med",	"2Doors",	"2Persons",	"small",	"med"},
			{"low",	"med",	"2Doors",	"morePerson",	"small",	"low"},
			{"med",	"med",	"5Doors",	"4Persons",	"big",	"low"},
			{"low",	"low",	"4Doors",	"morePerson",	"small",	"low"},
			{"low",	"high",	"5Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"low",	"2Doors",	"4Persons",	"small",	"low"},
			{"med",	"vhigh",	"4Doors",	"morePerson",	"small",	"high"},
			{"med",	"vhigh",	"3Doors",	"4Persons",	"big",	"high"},
			{"med",	"low",	"4Doors",	"4Persons",	"big",	"high"},
			{"vhigh",	"low",	"4Doors",	"2Persons",	"small",	"low"},
			{"high",	"vhigh",	"5Doors",	"morePerson",	"big",	"low"},
			{"high",	"med",	"4Doors",	"2Persons",	"big",	"high"},
			{"med",	"high",	"4Doors",	"2Persons",	"med",	"med"},
			{"low",	"low",	"2Doors",	"4Persons",	"med",	"high"},
			{"low",	"low",	"4Doors",	"2Persons",	"med",	"med"},
			{"med",	"high",	"4Doors",	"2Persons",	"big",	"high"},
			{"med",	"high",	"3Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"med",	"3Doors",	"4Persons",	"med",	"med"},
			{"low",	"high",	"4Doors",	"morePerson",	"med",	"low"},
			{"med",	"vhigh",	"3Doors",	"4Persons",	"med",	"high"},
			{"vhigh",	"med",	"5Doors",	"2Persons",	"small",	"low"},
			{"low",	"vhigh",	"3Doors",	"2Persons",	"big",	"low"},
			{"med",	"low",	"3Doors",	"morePerson",	"big",	"low"},
			{"vhigh",	"high",	"3Doors",	"4Persons",	"big",	"high"},
			{"med",	"high",	"2Doors",	"4Persons",	"med",	"med"},
			{"high",	"low",	"5Doors",	"4Persons",	"med",	"med"},
			{"low",	"high",	"5Doors",	"morePerson",	"big",	"low"},
			{"high",	"med",	"3Doors",	"morePerson",	"med",	"low"},
			{"med",	"low",	"3Doors",	"4Persons",	"small",	"high"},
			{"vhigh",	"high",	"4Doors",	"2Persons",	"small",	"low"},
			{"low",	"low",	"2Doors",	"2Persons",	"small",	"high"},
			{"med",	"low",	"4Doors",	"morePerson",	"med",	"low"},
			{"vhigh",	"med",	"2Doors",	"2Persons",	"med",	"low"},
			{"high",	"high",	"3Doors",	"morePerson",	"med",	"high"},
			{"vhigh",	"vhigh",	"3Doors",	"2Persons",	"med",	"high"},
			{"med",	"vhigh",	"5Doors",	"morePerson",	"med",	"low"},
			{"high",	"med",	"3Doors",	"4Persons",	"big",	"med"},
			{"med",	"vhigh",	"3Doors",	"2Persons",	"big",	"med"},
			{"med",	"vhigh",	"3Doors",	"4Persons",	"small",	"med"},
			{"high",	"low",	"3Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"low",	"5Doors",	"2Persons",	"small",	"high"},
			{"med",	"high",	"4Doors",	"4Persons",	"big",	"low"},
			{"high",	"high",	"5Doors",	"morePerson",	"med",	"med"},
			{"low",	"low",	"3Doors",	"4Persons",	"med",	"med"},
			{"med",	"vhigh",	"3Doors",	"2Persons",	"med",	"med"},
			{"vhigh",	"low",	"4Doors",	"4Persons",	"big",	"low"},
			{"high",	"low",	"5Doors",	"2Persons",	"big",	"med"},
			{"high",	"med",	"2Doors",	"2Persons",	"small",	"high"},
			{"high",	"vhigh",	"4Doors",	"morePerson",	"med",	"high"},
			{"med",	"high",	"2Doors",	"2Persons",	"small",	"high"},
			{"high",	"med",	"3Doors",	"2Persons",	"med",	"high"},
			{"vhigh",	"high",	"5Doors",	"morePerson",	"med",	"high"},
			{"high",	"low",	"2Doors",	"4Persons",	"med",	"high"},
			{"high",	"low",	"3Doors",	"4Persons",	"big",	"low"},
			{"low",	"med",	"4Doors",	"2Persons",	"med",	"med"},
			{"vhigh",	"med",	"4Doors",	"morePerson",	"med",	"med"},
			{"low",	"med",	"2Doors",	"2Persons",	"med",	"med"},
			{"low",	"high",	"2Doors",	"4Persons",	"med",	"low"},
			{"high",	"vhigh",	"5Doors",	"2Persons",	"small",	"high"},
			{"vhigh",	"low",	"4Doors",	"2Persons",	"med",	"high"},
			{"low",	"low",	"4Doors",	"4Persons",	"med",	"low"},
			{"med",	"high",	"2Doors",	"2Persons",	"med",	"high"},
			{"med",	"low",	"2Doors",	"morePerson",	"med",	"low"},
			{"vhigh",	"high",	"2Doors",	"morePerson",	"med",	"high"},
			{"low",	"low",	"4Doors",	"2Persons",	"big",	"low"},
			{"med",	"vhigh",	"5Doors",	"morePerson",	"small",	"low"},
			{"vhigh",	"high",	"3Doors",	"2Persons",	"small",	"med"},
			{"vhigh",	"med",	"5Doors",	"2Persons",	"small",	"high"},
			{"vhigh",	"low",	"5Doors",	"2Persons",	"big",	"med"},
			{"low",	"high",	"3Doors",	"4Persons",	"med",	"med"},
			{"low",	"med",	"5Doors",	"4Persons",	"med",	"low"},
			{"med",	"high",	"4Doors",	"4Persons",	"big",	"med"},
			{"vhigh",	"high",	"5Doors",	"4Persons",	"small",	"med"},
			{"low",	"med",	"3Doors",	"morePerson",	"big",	"med"},
			{"high",	"med",	"5Doors",	"2Persons",	"small",	"high"},
			{"vhigh",	"med",	"5Doors",	"4Persons",	"big",	"high"},
			{"high",	"low",	"5Doors",	"4Persons",	"small",	"low"},
			{"vhigh",	"high",	"3Doors",	"2Persons",	"med",	"low"},
			{"high",	"high",	"4Doors",	"4Persons",	"small",	"med"},
			{"vhigh",	"high",	"5Doors",	"4Persons",	"med",	"low"},
			{"med",	"med",	"3Doors",	"4Persons",	"med",	"high"},
			{"vhigh",	"vhigh",	"3Doors",	"morePerson",	"small",	"high"},
			{"med",	"med",	"4Doors",	"2Persons",	"small",	"med"},
			{"med",	"vhigh",	"2Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"low",	"4Doors",	"morePerson",	"small",	"med"},
			{"high",	"high",	"4Doors",	"2Persons",	"small",	"med"},
			{"vhigh",	"vhigh",	"5Doors",	"morePerson",	"med",	"med"},
			{"low",	"vhigh",	"3Doors",	"2Persons",	"small",	"high"},
			{"med",	"low",	"5Doors",	"morePerson",	"small",	"med"},
			{"low",	"high",	"4Doors",	"4Persons",	"small",	"high"},
			{"high",	"med",	"2Doors",	"4Persons",	"med",	"low"},
			{"vhigh",	"high",	"5Doors",	"morePerson",	"small",	"med"},
			{"low",	"low",	"5Doors",	"4Persons",	"med",	"med"},
			{"vhigh",	"high",	"5Doors",	"2Persons",	"med",	"med"},
			{"high",	"high",	"3Doors",	"2Persons",	"med",	"med"},
			{"med",	"high",	"4Doors",	"4Persons",	"small",	"high"},
			{"vhigh",	"low",	"3Doors",	"4Persons",	"small",	"med"},
			{"vhigh",	"med",	"4Doors",	"2Persons",	"med",	"high"},
			{"vhigh",	"high",	"3Doors",	"2Persons",	"small",	"high"},
			{"med",	"vhigh",	"5Doors",	"4Persons",	"small",	"low"},
			{"high",	"low",	"3Doors",	"morePerson",	"small",	"low"},
			{"vhigh",	"high",	"2Doors",	"morePerson",	"big",	"med"},
			{"low",	"low",	"2Doors",	"morePerson",	"small",	"high"},
			{"high",	"high",	"5Doors",	"2Persons",	"med",	"high"},
			{"high",	"med",	"2Doors",	"4Persons",	"med",	"high"},
			{"med",	"med",	"5Doors",	"morePerson",	"small",	"high"},
			{"med",	"med",	"2Doors",	"4Persons",	"med",	"med"},
			{"med",	"low",	"3Doors",	"4Persons",	"med",	"high"},
			{"low",	"med",	"4Doors",	"2Persons",	"big",	"high"},
			{"low",	"high",	"3Doors",	"morePerson",	"big",	"high"},
			{"vhigh",	"vhigh",	"2Doors",	"2Persons",	"med",	"low"},
			{"vhigh",	"low",	"2Doors",	"2Persons",	"big",	"high"},
			{"low",	"med",	"5Doors",	"morePerson",	"small",	"med"},
			{"med",	"high",	"5Doors",	"4Persons",	"big",	"low"},
			{"med",	"vhigh",	"4Doors",	"4Persons",	"med",	"med"},
			{"med",	"high",	"5Doors",	"morePerson",	"med",	"high"},
			{"high",	"high",	"3Doors",	"morePerson",	"med",	"low"},
			{"med",	"vhigh",	"3Doors",	"4Persons",	"med",	"med"},
			{"high",	"low",	"3Doors",	"2Persons",	"big",	"med"},
			{"vhigh",	"vhigh",	"4Doors",	"4Persons",	"big",	"high"},
			{"low",	"low",	"3Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"vhigh",	"3Doors",	"morePerson",	"big",	"high"},
			{"med",	"med",	"3Doors",	"2Persons",	"small",	"high"},
			{"high",	"vhigh",	"3Doors",	"morePerson",	"small",	"high"},
			{"low",	"high",	"4Doors",	"4Persons",	"small",	"low"},
			{"med",	"med",	"2Doors",	"morePerson",	"med",	"high"},
			{"vhigh",	"high",	"4Doors",	"2Persons",	"big",	"low"},
			{"high",	"vhigh",	"3Doors",	"4Persons",	"big",	"high"},
			{"med",	"med",	"2Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"low",	"3Doors",	"morePerson",	"small",	"low"},
			{"med",	"high",	"3Doors",	"4Persons",	"big",	"high"},
			{"high",	"med",	"4Doors",	"4Persons",	"med",	"med"},
			{"low",	"med",	"3Doors",	"4Persons",	"small",	"med"},
			{"vhigh",	"vhigh",	"4Doors",	"morePerson",	"big",	"med"},
			{"high",	"low",	"3Doors",	"4Persons",	"med",	"med"},
			{"low",	"low",	"5Doors",	"morePerson",	"med",	"med"},
			{"low",	"med",	"3Doors",	"4Persons",	"med",	"med"},
			{"low",	"high",	"5Doors",	"2Persons",	"med",	"med"},
			{"vhigh",	"high",	"5Doors",	"morePerson",	"small",	"low"},
			{"low",	"high",	"4Doors",	"4Persons",	"med",	"med"},
			{"low",	"med",	"3Doors",	"2Persons",	"small",	"med"},
			{"high",	"high",	"2Doors",	"4Persons",	"med",	"med"},
			{"vhigh",	"med",	"3Doors",	"morePerson",	"big",	"high"},
			{"med",	"low",	"3Doors",	"4Persons",	"med",	"med"},
			{"med",	"vhigh",	"2Doors",	"4Persons",	"med",	"low"},
			{"high",	"high",	"3Doors",	"4Persons",	"big",	"med"},
			{"vhigh",	"vhigh",	"5Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"low",	"4Doors",	"4Persons",	"big",	"high"},
			{"vhigh",	"med",	"2Doors",	"morePerson",	"small",	"low"},
			{"high",	"vhigh",	"4Doors",	"morePerson",	"big",	"low"},
			{"high",	"high",	"4Doors",	"2Persons",	"med",	"med"},
			{"high",	"med",	"3Doors",	"4Persons",	"big",	"low"},
			{"med",	"low",	"5Doors",	"2Persons",	"med",	"high"},
			{"med",	"low",	"5Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"med",	"5Doors",	"2Persons",	"small",	"med"},
			{"vhigh",	"high",	"5Doors",	"4Persons",	"big",	"low"},
			{"vhigh",	"med",	"4Doors",	"4Persons",	"small",	"high"},
			{"high",	"high",	"3Doors",	"2Persons",	"small",	"med"},
			{"high",	"low",	"5Doors",	"2Persons",	"small",	"high"},
			{"high",	"low",	"3Doors",	"morePerson",	"med",	"med"},
			{"high",	"med",	"3Doors",	"morePerson",	"big",	"high"},
			{"high",	"high",	"4Doors",	"morePerson",	"big",	"high"},
			{"high",	"low",	"5Doors",	"4Persons",	"med",	"low"},
			{"high",	"vhigh",	"5Doors",	"morePerson",	"med",	"high"},
			{"high",	"med",	"3Doors",	"2Persons",	"big",	"low"},
			{"low",	"high",	"2Doors",	"morePerson",	"med",	"high"},
			{"high",	"high",	"2Doors",	"morePerson",	"med",	"high"},
			{"low",	"low",	"4Doors",	"4Persons",	"big",	"med"},
			{"high",	"vhigh",	"5Doors",	"2Persons",	"small",	"low"},
			{"low",	"high",	"5Doors",	"4Persons",	"small",	"low"},
			{"med",	"med",	"2Doors",	"morePerson",	"big",	"med"},
			{"low",	"med",	"5Doors",	"2Persons",	"small",	"low"},
			{"low",	"high",	"2Doors",	"4Persons",	"big",	"high"},
			{"vhigh",	"low",	"2Doors",	"morePerson",	"small",	"low"},
			{"low",	"vhigh",	"2Doors",	"4Persons",	"big",	"high"},
			{"low",	"low",	"2Doors",	"4Persons",	"small",	"high"},
			{"med",	"vhigh",	"3Doors",	"morePerson",	"big",	"low"},
			{"vhigh",	"low",	"3Doors",	"morePerson",	"big",	"low"},
			{"vhigh",	"vhigh",	"5Doors",	"morePerson",	"small",	"med"},
			{"med",	"low",	"3Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"high",	"2Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"high",	"4Doors",	"4Persons",	"small",	"med"},
			{"med",	"med",	"5Doors",	"morePerson",	"big",	"low"},
			{"med",	"high",	"3Doors",	"4Persons",	"small",	"med"},
			{"vhigh",	"low",	"3Doors",	"morePerson",	"small",	"med"},
			{"med",	"low",	"3Doors",	"morePerson",	"big",	"high"},
			{"vhigh",	"low",	"5Doors",	"morePerson",	"med",	"high"},
			{"med",	"vhigh",	"3Doors",	"morePerson",	"small",	"med"},
			{"med",	"high",	"2Doors",	"morePerson",	"big",	"high"},
			{"low",	"low",	"4Doors",	"4Persons",	"big",	"high"},
			{"med",	"vhigh",	"3Doors",	"2Persons",	"med",	"low"},
			{"med",	"med",	"4Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"low",	"5Doors",	"2Persons",	"med",	"med"},
			{"low",	"med",	"2Doors",	"4Persons",	"small",	"low"},
			{"high",	"high",	"5Doors",	"morePerson",	"small",	"low"},
			{"low",	"vhigh",	"2Doors",	"4Persons",	"med",	"low"},
			{"vhigh",	"vhigh",	"5Doors",	"2Persons",	"med",	"high"},
			{"low",	"vhigh",	"4Doors",	"2Persons",	"small",	"med"},
			{"high",	"low",	"5Doors",	"morePerson",	"small",	"med"},
			{"med",	"med",	"2Doors",	"2Persons",	"small",	"med"},
			{"low",	"med",	"4Doors",	"2Persons",	"small",	"high"},
			{"vhigh",	"high",	"2Doors",	"morePerson",	"med",	"med"},
			{"vhigh",	"low",	"3Doors",	"2Persons",	"med",	"med"},
			{"high",	"vhigh",	"4Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"low",	"4Doors",	"4Persons",	"small",	"med"},
			{"low",	"low",	"5Doors",	"4Persons",	"small",	"high"},
			{"high",	"med",	"3Doors",	"4Persons",	"small",	"high"},
			{"low",	"med",	"5Doors",	"4Persons",	"small",	"low"},
			{"med",	"vhigh",	"5Doors",	"4Persons",	"small",	"med"},
			{"vhigh",	"vhigh",	"4Doors",	"2Persons",	"med",	"high"},
			{"vhigh",	"med",	"4Doors",	"4Persons",	"big",	"low"},
			{"low",	"high",	"3Doors",	"4Persons",	"small",	"low"},
			{"med",	"med",	"5Doors",	"2Persons",	"med",	"med"},
			{"high",	"low",	"3Doors",	"4Persons",	"med",	"high"},
			{"high",	"vhigh",	"3Doors",	"2Persons",	"small",	"low"},
			{"high",	"low",	"4Doors",	"2Persons",	"small",	"med"},
			{"low",	"vhigh",	"4Doors",	"2Persons",	"big",	"med"},
			{"med",	"high",	"3Doors",	"2Persons",	"big",	"low"},
			{"low",	"vhigh",	"5Doors",	"2Persons",	"small",	"high"},
			{"low",	"high",	"5Doors",	"2Persons",	"big",	"med"},
			{"med",	"high",	"5Doors",	"2Persons",	"med",	"high"},
			{"vhigh",	"vhigh",	"5Doors",	"4Persons",	"big",	"med"},
			{"low",	"vhigh",	"4Doors",	"morePerson",	"big",	"med"},
			{"vhigh",	"med",	"4Doors",	"2Persons",	"big",	"low"},
			{"high",	"low",	"3Doors",	"morePerson",	"small",	"med"},
			{"vhigh",	"vhigh",	"2Doors",	"2Persons",	"big",	"low"},
			{"vhigh",	"med",	"3Doors",	"4Persons",	"big",	"low"},
			{"med",	"med",	"5Doors",	"2Persons",	"small",	"low"},
			{"vhigh",	"low",	"4Doors",	"morePerson",	"big",	"high"},
			{"vhigh",	"vhigh",	"3Doors",	"4Persons",	"small",	"med"},
			{"med",	"high",	"2Doors",	"4Persons",	"small",	"low"},
			{"high",	"high",	"4Doors",	"4Persons",	"big",	"med"},
			{"high",	"vhigh",	"2Doors",	"2Persons",	"big",	"high"},
			{"med",	"med",	"3Doors",	"2Persons",	"small",	"med"}
			};
}
