class third_max_num {
    public int thirdMax(int[] arr) {
        Integer first = null, second = null, third = null;
        for(Integer num:arr){
            if(first.equals(num) || second.equals(num) || third.equals(num)){
                continue; // Don't want duplicate values in first, second, third.
            }

            if(first == null || first<num){
                // -> yato first null he, yato uski value choti he as compared to num.
                third = second;
                second = first;
                first = num;
            }
            else if(second==null || second<num){
                third = second;
                second = num;
            }
            else if(third==null || third<num){
                third = num;
            }
        }

        return (third==null) ? first : third;
        // Agr third null he matlab third max doesnt exist, uss case me first return karna he.
    }
}
