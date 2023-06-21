import java.util.ArrayList;
import java.util.LinkedList;

/**
 * HashMapImplementation
 */
public class HashMapImplementation {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> bucket[];
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int getBucketIdx(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = getBucketIdx(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                bucket[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            double lambda = (double) N / n;
            if (lambda > 2) {
                rehash();
            }
        }
        @SuppressWarnings("Unchecked")
        private void rehash() {
            LinkedList<Node> oldbucket[]=bucket;
            bucket=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node> ll=oldbucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public V get(K key){
            int bi=getBucketIdx(key);
            int di=searchInLL(key, bi);
            if(di==-1){
                return null;
            }
            else{
                Node node=bucket[bi].get(di);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bi=getBucketIdx(key);
            int di=searchInLL(key, bi);
            if(di==-1){
                return false;
            }
            else{
                return true;
            }
        }
        public V remove(K key){
            int bi=getBucketIdx(key);
            int di=searchInLL(key, bi);
            if(di==-1){
                return null;
            }
            else{
                Node node=bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<bucket.length;i++){
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

    }
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("India", 100);
        map.put("Pakistan", 80);
        map.put("Srilanka", 70);
        map.put("China", 110);
        map.put("China", 110);
        ArrayList<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" : "+map.get(keys.get(i)));
        }   
    }
}