class VariablesAndDataTypes{
    public static void main(String[] args) {
        //boolean true/false 
        boolean flag = true;
        System.out.println(flag);
        
        //byte [-128,127]
        byte range;
        range = 124;
        System.out.println(range);
        
        //short [-32768,32767] 16-bit
        short temperature;
        temperature = -200;
        System.out.println(temperature);
        
        // int 32-bit
        int rangeInt = -4250000;
        System.out.println(rangeInt);
        
        // long 64-bit 
        long  rangeLong = -42332200000L;
        System.out.println(rangeLong);
        
        // double 64-bit
        // It should never be used for precise values such as currency.
        double number = -42.3;
        System.out.println(number);

        // float 32-bit
        // It should never be used for precise values such as currency.
        float numberFloat = -42.3f;
        System.out.println(numberFloat);

        // char 16-bit Unicode character.
        char letter = '\u0051';
        System.out.println(letter);

    }
}