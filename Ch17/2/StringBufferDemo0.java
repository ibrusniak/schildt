
public class StringBufferDemo0 {

    public static void main(String[] args) {
        
        StringBuffer sb
            = new StringBuffer();
        
        // initial capacity is 16
        System.out.println("Capacity: " + sb.capacity());

        // initial length is 0
        System.out.println("Length: " + sb.length());

        sb.ensureCapacity(100);
        System.out.println(sb.capacity()); // 100

        sb.append("String");
        sb.setLength(3);
        System.out.println(sb); // Str

        sb.setLength(0); // is empty now

        sb.append("olleH");
        sb.reverse();
        System.out.println(sb); // Hello
    }    
}

