class State {
    int height, width;

    State(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // Copy constructor
    State(State state) {
        this.height = state.height;
        this.width = state.width;
    }

    public Integer getArea() {
        return this.height * this.width;
    }
}
