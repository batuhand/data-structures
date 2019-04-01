/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

/**
 *
 * @author Cengiz
 */
public class Btree {

    Node root;

    public boolean insert(Data data) {
        Node temp = new Node(data);
        if (root == null) {
            root = temp;
            return true;
        }
        Node searchtemp = root;
        while (true) {
            if (searchtemp.data.id < data.id) {
                if (searchtemp.right == null) {
                    searchtemp.right = temp;
                    return true;
                }
                searchtemp = searchtemp.right;
            } else if (searchtemp.data.id > data.id) {
                if (searchtemp.left == null) {
                    searchtemp.left = temp;
                    return true;
                }
                searchtemp = searchtemp.left;
            } else {
                return false;
            }

        }

    }

    public void printDFS(Node current) {
        if (current == null) {
            return;
        }

        System.out.println(current.data);
        printDFS(current.left);
        printDFS(current.right);

    }

    public void printBFS() {
        Queue queue = new Queue();
        if (root == null) {
            return;
        }
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();

            System.out.println(temp.data);
            if (temp.left != null) {
                queue.enqueue(temp.left);
            }
            if (temp.right != null) {
                queue.enqueue(temp.right);
            }
        }

    }

    public void printDFS() {

        printDFS(root);

    }

    public Data search(int id) {

        if (root == null) {

            return null;
        }
        Node searchtemp = root;
        while (true) {
            if (searchtemp.data.id < id) {
                if (searchtemp.right == null) {
                    return null;
                }

                searchtemp = searchtemp.right;
            } else if (searchtemp.data.id > id) {
                if (searchtemp.left == null) {
                    return null;
                }
                searchtemp = searchtemp.left;
            } else {
                return searchtemp.data;
            }

        }

    }

    public Node deleteH(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node;
        while (temp.right != null) {
            temp = temp.right;

        }
        return temp;

    }

    public boolean delete(int id) {
        if (root == null) {

            return false;
        }
        Node searchtemp = root;
        if (searchtemp.data.id == id) {
            Node result = deleteH(searchtemp.left);
            if (result == null) {
                if (root.right == null) {
                    root = null;
                } else {
                    root = root.right;
                }
                return true;
            }

        }

        while (true) {
            if (searchtemp.left.data.id == id) {
                Node result = deleteH(searchtemp.left);
                if (result == null) {
                    searchtemp.left = searchtemp.left.left;
                    return true;
                }
                result.left = searchtemp.left.left;
                searchtemp.left = result;
                return true;

            } else if (searchtemp.right.data.id == id) {
                Node result = deleteH(searchtemp.right);
                if (result == null) {
                    searchtemp.right = searchtemp.right.right;
                    return true;
                }
                result.right = searchtemp.right.right;
                searchtemp.right = result;
                return true;

            }
            if (searchtemp.data.id < id) {

                if (searchtemp.right == null) {
                    return false;
                }

                searchtemp = searchtemp.right;
            } else if (searchtemp.data.id > id) {
                if (searchtemp.left == null) {
                    return false;
                }
                searchtemp = searchtemp.left;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Data data = new Data(10, "on");
        Btree btree = new Btree();
        System.out.println(btree.insert(data));
        data = new Data(5, "bes");
        System.out.println(btree.insert(data));
        data = new Data(20, "yirmi");
        System.out.println(btree.insert(data));
        data = new Data(3, "uc");
        System.out.println(btree.insert(data));
        data = new Data(6, "alti");
        System.out.println(btree.insert(data));
        data = new Data(15, "onbes");
        System.out.println(btree.insert(data));
        data = new Data(22, "yirmiiki");
        System.out.println(btree.insert(data));

        btree.printDFS();
        System.out.println(btree.search(20));
        System.out.println(btree.search(45));
        System.out.println("====BFS====");
        btree.printBFS();
        System.out.println(btree.delete(20));
        System.out.println("====BFS====");
        btree.printBFS();
    }

}
