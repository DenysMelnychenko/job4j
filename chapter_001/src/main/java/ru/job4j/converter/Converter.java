package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int euroValue = 70;
        return value/euroValue;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        int dollarValue = 60;
        return value/dollarValue;
    }

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int euroToRuble(int value) {
        int euroValue = 70;
        return value*euroValue;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int dollarToRuble(int value) {
        int dollarValue = 60;
        return value*dollarValue;
    }
}
