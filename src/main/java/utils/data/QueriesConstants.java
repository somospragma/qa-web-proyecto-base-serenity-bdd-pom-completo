package utils.data;

public class QueriesConstants {

    public static final String DELETE_DATA_POSTULATION_TABLE = " DELETE FROM postulation " + " ALTER TABLE postulation AUTO_INCREMENT = 1 ";
    public static final String DELETE_DATA_CANDIDATE_TABLE = " DELETE FROM candidate " + " ALTER TABLE candidate AUTO_INCREMENT = 1 ";
    public static final String DELETE_DATA_VACANCY_TABLE = " DELETE FROM vacancy " + " ALTER TABLE vacancy AUTO_INCREMENT = 1 ";
    public static final String DELETE_VACANCY_BY_ID = " DELETE FROM vacancy " + " WHERE id_vacancy='%s' ";

    public static final String SELECT_DATA_VACANCY_TABLE = " SELECT * FROM vacancy ";
    public static final String SELECT_VACANCY_BY_ID = SELECT_DATA_VACANCY_TABLE + " WHERE id_vacancy='%s' ";

}
