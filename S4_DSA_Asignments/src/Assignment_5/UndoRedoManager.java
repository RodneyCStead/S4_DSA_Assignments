package Assignment_5;

/**
 * Implement an application that supports undo/redo functionality. use a linked list to maintain a sequence of states
 * Each State change is stored as a node in the list, allowing for easy navigation
 * 1<>2<>3<>4<>5
 */
public class UndoRedoManager<T> {
    private class Node {
        private T state;
        private Node prev;
        private Node next;

        private Node(T state) {
            this.state = state;
        }
    }

    private Node currentState;

    // Undo operation
    public T undo() {
        if (currentState == null) {
            System.out.println("No state to undo");
            return null;
        }
        // Get the previous state
        Node previousState = currentState.prev;
        if (previousState == null) {
            System.out.println("Reached the initial state");
            return null;
        } else {
            // update the current state to the previous state
            currentState = previousState;
        }
        return currentState.state;
    }

    // perform an operation
    public void addState(T newState) {
        Node newNode = new Node(newState);

        // set the links for the new node
        newNode.prev = currentState;
        newNode.next = null;

        // update the next link for the current state
        if (currentState != null) {
            currentState.next = newNode;
        }
        // update the current to the new state
        currentState = newNode;
    }

    // Redo operation
    public T redo() {
        if (currentState == null) {
            System.out.println("No state to redo");
            return null;
        }
        // Get the next state
        Node nextState = currentState.next;
        if (nextState == null) {
            System.out.println("Reached the latest state");
            return null;
        } else {
            // update the current state to the next state
            currentState = nextState;
        }
        return currentState.state;
    }



    public static void main(String[] args) {
        UndoRedoManager<String> undoRedoManager = new UndoRedoManager<String>();
        undoRedoManager.addState("State 1");
        undoRedoManager.addState("State 2");
        undoRedoManager.addState("State 3");
        undoRedoManager.addState("State 4");
        undoRedoManager.addState("State 5");
        undoRedoManager.addState("State 6");
        undoRedoManager.addState("State 7");

        System.out.println("Current State: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current State: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current State: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();

        // Testing the redo operation
        System.out.println("Current State: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current State: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("Current State: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
    }
}
