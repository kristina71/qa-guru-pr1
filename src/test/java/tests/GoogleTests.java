package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    void selenideSearchTest() {
        // Открыть google
        open("https://google.com");

        // Ввести Selenide в поиск
        $(".gLFyf").setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $(".iUh30").shouldHave(text("ru.selenide.org"));
    }
}
