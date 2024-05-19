package Review2;

public class Exercise12 {
	public static String formatDate(String date) {
		String[] part = date.split("/");
		int day =  Integer.parseInt(part[0]);
		int month =  Integer.parseInt(part[1]);
		int year =  Integer.parseInt(part[2]);
		
		
		
		return transformDay(day, month, year)+" "+transformMonth(month)+" "+transformYear(year);
	}
	public static String transformYear(int year) {
		String result = year>0? String.valueOf(year):null;
		return result;
	}
	
	public static String transformMonth(int month) {
		switch(month){
			case 1:
				return "January";
			case 2:
				return "Febrary";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "Jun";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				return "illegal"; 
		}
	}
	public static String transformDay(int day, int month, int year) {
		String result = "";
		if(day>0 && month<=12 && year>0) {
			if(month<8) {
				if(month%2!=0) {
					result=day<=31?result+=day:null;
				}else {
					if(month!=2 ) {
						result=day<=30?result+=day:null;

					}else {
						if(year%400==0) {
							result=day<=29?result+=day:null;

						}else {
							result = day<=28?result+=day:null;
						}
					}
				}
			}else {
				if(month%2==0) {
					result=day<=31?result+=day:null;
				}else {
					result=day<=30?result+=day:null;
				}
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		String date = "31/12/1990";
		System.out.println(formatDate(date));
	}
}
