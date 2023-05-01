package Exercises.Second_Medium;
//468 验证IP地址
public class validate_ip_address {
    public String validIPAddress(String queryIP) {
        if(isIPv4(queryIP)) {
            return "IPv4";
        }
        if(isIPv6(queryIP)) {
            return "IPv6";
        }
        return "Neither";
    }
    public boolean isIPv4(String IP) {
        if(IP.length() == 0 || IP.charAt(IP.length() - 1) == '.') {
            return false;
        }
        String[] IP4 = IP.split("\\.");
        if(IP4.length != 4) {
            return false;
        }
        for(String str : IP4) {
            System.out.println(str);
            if(str.length() < 1 || str.length() > 3) {
                return false;
            }
            if(str.length() > 1 && str.charAt(0) == '0') {
                return false;
            }
            int integer = -1;
            try {
                integer = Integer.parseInt(str);
            }catch (Exception e) {
                return false;
            }
            if(integer < 0 || integer > 255) {
                return false;
            }
        }
        return true;
    }
    public boolean isIPv6(String IP) {
        if(IP.length() == 0 || IP.charAt(IP.length() - 1) == ':') {
            return false;
        }
        String[] IP6 = IP.split(":");
        System.out.println(IP6.length);
        if(IP6.length != 8) {
            return false;
        }
        for(String str : IP6) {
            char[] chars = str.toCharArray();
            if(chars.length < 1 || chars.length > 4) {
                return false;
            }
            for(char ch : chars) {
                if((!(ch >= 'a' && ch <= 'f')) && (!(ch >= 'A' && ch <= 'F')) && (!(ch >= '0' && ch <= '9'))) {
                    return false;
                }
            }
        }
        return true;
    }
}
