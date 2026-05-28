package kz.jysan.business.gov.connector.adata.dto.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Данные по реабилитации и банкротству (payload)
 */
@Getter
@Setter
public class RehabilitationInfo {

    /**
     * Реструктуризация долгов
     */
    private RehabilitationRegistryItem debtRestructuring;

    /**
     * Собрания кредиторов в процедуре банкротства
     */
    private RehabilitationRegistryItem bankruptMeetings;

    /**
     * Ликвидация
     */
    private RehabilitationRegistryItem liquidation;

    /**
     * Заявление временного управляющего
     */
    private RehabilitationRegistryItem temporaryManagerStatement;

    /**
     * Собрания кредиторов в процедуре реабилитации
     */
    private RehabilitationRegistryItem rehabilitationMeetings;

    /**
     * Заявление о реабилитации
     */
    private RehabilitationRegistryItem rehabilitationStatement;
}
