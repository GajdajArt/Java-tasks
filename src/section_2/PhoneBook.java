package section_2;

import java.util.*;

public class PhoneBook implements Map {

    private HashMap hashMap;
    private LinkedList<User> linkedList;

    public PhoneBook() {
        hashMap = new HashMap();
        linkedList = new LinkedList();
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object phoneNumber) {
        return hashMap.containsKey(phoneNumber);
    }

    @Override
    public boolean containsValue(Object name) {
        return hashMap.containsValue(name);
    }

    @Override
    public Object get(Object key) {
        return hashMap.get(key);
    }

    public LinkedList getByName(String userName) {

        LinkedList result = new LinkedList();

        for (int i = 0; i < linkedList.size(); i++) {
            String thisTile = linkedList.get(i).getUserName();

            if (thisTile.equals(userName)) {
                result.add(linkedList.get(i).getUserPhoneNumber());
            }
        }
        return result;
    }

    @Override
    public Object put(Object phoneNumber, Object userName) {

        if (phoneNumber instanceof String && userName instanceof String) {
                if (!hashMap.containsKey(phoneNumber)) {
                    User user = new User((String) phoneNumber, (String) userName);
                    linkedList.add(user);
            }
        }
        return hashMap.put(phoneNumber, userName);
    }

    public void put(String[] inputUser) {

            if (!hashMap.containsKey(inputUser[1])) {
                User user = new User(inputUser[1], inputUser[0]);
                linkedList.add(user);
                hashMap.put(inputUser[1], inputUser[0]);
            }
    }



    @Override
    public Object remove(Object phoneNumber) {
        linkedList.remove(hashMap.remove(phoneNumber));
        return hashMap.remove(phoneNumber);
    }

    @Override
    public void putAll(Map m) {
    }

    @Override
    public void clear() {
        hashMap.clear();
        linkedList.clear();
    }

    @Override
    public Set keySet() {
        return hashMap.keySet();
    }

    @Override
    public Collection values() {
        return hashMap.values();
    }

    @Override
    public Set<Entry> entrySet() {
        return hashMap.entrySet();
    }

    private class User{

        private final String userPhoneNumber;
        private final String userName;

        public User(String userPhoneNumber, String userName) {
            this.userPhoneNumber = userPhoneNumber;
            this.userName = userName;
        }

        public String getUserPhoneNumber() {
            return userPhoneNumber;
        }

        public String getUserName() {
            return userName;
        }

    }
}
