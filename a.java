public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) return s;
        String[] rows = new String[numRows];
        boolean flag = false;
        int i = 0;
        for(char c : s.toCharArray()) {
            rows[i] += c;
            if(i == 0 || i == numRows - 1) {
                flag = !flag;
            }
//            i++;
            i += flag ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for(String tmp : rows) {
            res.append(tmp);
        }
        return res.toString();
    }
