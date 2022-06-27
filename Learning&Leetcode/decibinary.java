public class decibinary {
    public int minPartitions(String n) {
        char max = n.charAt(0);
        for (char c : n.toCharArray()) {
            if(c > max) max = c;
        }
        return max-48;
    }
}