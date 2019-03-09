package practice.march.eleventh;

/*	给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
	S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
	J 中的字母不重复，J 和 S中的所有字符都是字母。
	字母区分大小写，因此"a"和"A"是不同类型的石头。 
*/
public class GemsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class Solution3 {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for(int i=0;i<J.length();i++){
            String waitJestify =J.substring(i,i+1);
            int formIndex = 0;
            int returnNum = S.indexOf(waitJestify,formIndex);
            while(returnNum!=-1){
                num+=1;
                if (num ==S.length()){return num;}
                formIndex = returnNum +1;
                returnNum = S.indexOf(waitJestify,formIndex);
            }
        }
        return num;
    }
}