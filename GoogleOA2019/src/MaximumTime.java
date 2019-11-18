public class MaximumTime {

    public static void giveMeMaxTime(String time){
       char[] timeArray = time.toCharArray();
       timeArray[0] = (timeArray[0] =='?')? ((timeArray[1] <= '3')? '2': '1'):timeArray[0];
       timeArray[1] = (timeArray[1] == '?')?((timeArray[0] == '2')? '3' : '9'):timeArray[1];
       timeArray[3] = (timeArray[3] == '?')? '5' : timeArray[3];
       timeArray[4] = (timeArray[4] == '?')? '9' : timeArray[4];
       System.out.println(timeArray);
    }


    public static void main(String[] args) {
        giveMeMaxTime("23:5?");// 23:59
        giveMeMaxTime("2?:22");// 23:22
        giveMeMaxTime("0?:??");// 09:59
        giveMeMaxTime("1?:??");// 19:59
        giveMeMaxTime("?4:??");// 14:59
        giveMeMaxTime("?3:??");// 23:59
        giveMeMaxTime("??:??");// 23:59
        giveMeMaxTime("?4:5?"); //14:59
        giveMeMaxTime("?4:??"); //14:59
        giveMeMaxTime("?3:??"); //23:59
        giveMeMaxTime("23:5?"); //23:59
        giveMeMaxTime("2?:22"); //23:22
        giveMeMaxTime("0?:??"); //09:59
        giveMeMaxTime("1?:??"); //19:59
        giveMeMaxTime("?4:0?"); //14:09
        giveMeMaxTime("?9:4?"); //19:49
    }
}
