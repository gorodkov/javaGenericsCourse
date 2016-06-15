package generics.m0.e3;

public class Triple<T1, T2, T3> extends Tuple<T1, T3> {

    private final T2 middle;

    public Triple(final T1 left, final T2 middle, final T3 right) {
        super(left, right);
        this.middle = middle;
    }

    public T2 getMiddle() {
        return middle;
    }

}

/*

Задание
В данном задании Вам необходимо реализовать класс Triple который наследуется от Tuple,
который уже реализован за Вас. Как, думаю, Вы уже поняли класс должен иметь три поля:

left (с типом Т1)
middle (с типом Т2)
и right (с типом Т3)
Все три поля должны быть устанавливаемые через конструктор. Так же класс должен иметь три "getter"
для каждого поля соотвественно:

getLeft();
getMiddle();
getRight();

*/
