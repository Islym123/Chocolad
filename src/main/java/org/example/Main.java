package org.example;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        int availableMoney = 15;
        int costPerChocolate = 1;
        int wrappersForBonus = 3;

        // Считаем, сколько можно купить шоколадок на начальные деньги
        int totalChocolates = availableMoney / costPerChocolate;
        int currentWrappers = totalChocolates;

        // Проверяем, можем ли получить бонусные шоколадки за обёртки
        while (currentWrappers >= wrappersForBonus) {
            int bonusChocolates = currentWrappers / wrappersForBonus; // Бонусные шоколадки
            totalChocolates += bonusChocolates; // Добавляем бонусные шоколадки к общему количеству

            // Обновляем количество обёрток: бонусные обёртки плюс оставшиеся от предыдущего обмена
            currentWrappers = bonusChocolates + (currentWrappers % wrappersForBonus);
        }

        System.out.println("Итоговое количество шоколадок: " + totalChocolates);
    }
}
