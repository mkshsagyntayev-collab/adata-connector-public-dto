package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Судебное дело (payload) — полная детализация с историей и ссылками на PDF
 */
@Getter
@Setter
public class CourtCase {

    /**
     * Номер дела
     */
    private String number;

    /**
     * Результат рассмотрения
     */
    private String result;

    /**
     * Тип дела (Гражданское, Уголовное, Административное)
     */
    private String type;

    /**
     * Статус дела
     */
    private String status;

    /**
     * Роль компании/ИП в деле
     */
    private String role;

    /**
     * Итог дела
     */
    private String courtCaseResult;

    /**
     * Стороны дела
     */
    private List<String> sides;

    /**
     * Дата рассмотрения
     */
    private String date;

    /**
     * Наименование суда
     */
    private String court;

    /**
     * Категория дела
     */
    private String category;

    /**
     * Судья
     */
    private String judge;

    /**
     * Ответчики
     */
    private List<String> defendants;

    /**
     * Истцы
     */
    private List<String> plaintiffs;

    /**
     * История событий по делу
     */
    private List<CourtCaseHistory> history;

    /**
     * Документы дела (ссылки на PDF)
     */
    private List<CourtCaseDocument> documents;
}
