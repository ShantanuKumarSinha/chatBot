package app.shann.shann;

public class DecisionTree<K,V> {

    DecisionTree firstNode;

    K key;

    V value;

    DecisionTree secondNode;

    DecisionTree thirdNode;

    DecisionTree fourthNode;

    public DecisionTree getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(DecisionTree firstNode) {
        this.firstNode = firstNode;
    }

    public DecisionTree getFourthNode() {
        return fourthNode;
    }

    public void setFourthNode(DecisionTree fourthNode) {
        this.fourthNode = fourthNode;
    }

    public DecisionTree getSecondNode() {
        return secondNode;
    }

    public void setSecondNode(DecisionTree secondNode) {
        this.secondNode = secondNode;
    }

    public DecisionTree getThirdNode() {
        return thirdNode;
    }

    public void setThirdNode(DecisionTree thirdNode) {
        this.thirdNode = thirdNode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public DecisionTree(DecisionTree firstNode, DecisionTree fourthNode, DecisionTree secondNode, DecisionTree thirdNode, K key, V value) {
        this.firstNode = firstNode;
        this.fourthNode = fourthNode;
        this.secondNode = secondNode;
        this.thirdNode = thirdNode;
        this.value = value;
        this.key = key;
    }
}

