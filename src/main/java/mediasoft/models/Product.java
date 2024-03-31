package mediasoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String category;
    private String name;
    private String description;

    private Double price;
    private Integer quantity;

    private LocalDate dateOfCreation;
    private LocalDateTime dateOfLastQuantityChange;
}

/*
Дополнительные необязательные требования, но которые влияют на общую оценку:
1. 	Подключить Swagger или использовать specification-first подход (Open-API спецификацию
написать самостоятельно).
2. 	В качестве первичного ключа использовать UUID
3. 	Использовать Lombok в проекте. - Да
4. 	Реализовать валидацию полей запросов (на null, пустоту и т.д.)
5. 	В проект поместить коллекцию Postman с запросами и тестами.
6. 	Добавить юнит-тесты на бизнес-логику
7. 	Настроить локальный старт приложения под отдельным профилем.
8. 	Создать глобальный обработчик исключений.
9. 	Написать dockerfile или docker-compose для создания образа приложения.
10.  Написать Javadocs и инструкцию по запуску приложения.
 */