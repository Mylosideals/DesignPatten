class Context {
    private State state;

    //���廷����ĳ�ʼ״̬
    public Context() {
        this.state = new ConcreteStateA();
    }

    //������״̬
    public void setState(State state) {
        this.state = state;
    }

    //��ȡ״̬
    public State getState() {
        return (state);
    }

    //������������
    public void Handle() {
        state.Handle(this);
    }
}