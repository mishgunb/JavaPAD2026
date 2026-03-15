package lr2;

public class Encrypt {

    public static String getEncryptString(String encryptString, int shift) {
        // преобразуем переданную в метод строку в символьный массив
        char[] arrayChar = encryptString.toCharArray();

        // создаем массив с типом данных long, размер массива равен размеру символьного массива
        long[] arrayInt = new long[arrayChar.length];

        // создаем символьный массив в который будем записывать преобразованные символы
        char[] arrayCharNew = new char[arrayChar.length];

        // в цикле перебираем все символы из которых состоит переданная нами строка
        for (int i = 0; i < arrayChar.length; i++) {
            // прибавляем к символу с индексом i сдвиг
            arrayInt[i] = arrayChar[i] + shift;

            // преобразовываем число в символ char и записываем на нужное место в новый массив
            arrayCharNew[i] = (char) arrayInt[i];
        }

        // преобразовываем новый массив символов в строку
        encryptString = new String(arrayCharNew);

        // возвращаем строку в метод из которого был вызван текущий метод
        return encryptString;
    }
}

