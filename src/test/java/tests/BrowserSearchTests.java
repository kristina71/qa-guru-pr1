package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BrowserSearchTests {
    @Test
    void selenideSearchGoogleTest() {
        open("https://google.com");// Открыть google

        $(byName("q")).setValue("Selenide").pressEnter();// Ввести Selenide в поиск

        $("html").shouldHave(text("ru.selenide.org"));// Проверить, что Selenide появился в результатах поиска
    }

    @Test
    void selenideSearchYandexTest() {
        open("https://yandex.ru/");// Открыть Yandex

        $(".input__control").setValue("Selenide").pressEnter();// Ввести Selenide в поиск

        $(".link_theme_outer").shouldHave(text("ru.selenide.org"));// Проверить, что Selenide появился в результатах поиска
    }

}
