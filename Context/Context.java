package Context;
//������ʽ��
interface AbstractExpression {
    public void interpret(String info);    //���ͷ���
}
//�ս�����ʽ��
class TerminalExpression implements AbstractExpression {
    public void interpret(String info) {
        //���ս�����ʽ�Ĵ���
    }
}
//���ս�����ʽ��
class NonterminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;
    public void interpret(String info) {
        //�Ƕ��ս�����ʽ�Ĵ���
    }
}
//������
class Context {
    private AbstractExpression exp;
    public Context() {
        //���ݳ�ʼ��
    }
    public void operation(String info) {
        //������ر��ʽ��Ľ��ͷ���
    }
}