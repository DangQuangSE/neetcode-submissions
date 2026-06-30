class Solution {

    public String encode(List<String> strs) {
      StringBuilder encoded_string = new StringBuilder();
      for(String str : strs){
        encoded_string.append(str.length()).append("#").append(str);
      }
      return encoded_string.toString();
    }

    public List<String> decode(String str) {
      List<String> decoded_strs  = new ArrayList<>();
      int i = 0;
      while(i < str.length()){
        int j = i;
        while(str.charAt(j) != '#'){
            j++;
        }
        int k = Integer.parseInt(str.substring(i, j));
        i = j + 1;
        decoded_strs.add(str.substring(i, i + k));
        i += k;
      }
      return decoded_strs;
    }
}
