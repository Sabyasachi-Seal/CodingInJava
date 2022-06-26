
public class addbinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int pa = a.length()-1;
        int pb = b.length()-1;
        int carry = 0;
        while(pa>=0 || pb>=0){
            int sum = carry;
            if(pa >= 0) sum += a.charAt(pa) - '0';
            if(pb >= 0) sum += b.charAt(pb) - '0';
            sb.append(sum%2);
            carry = sum/2;
            pa--;
            pb--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
