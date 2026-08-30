package fun.crickclient.api.utils.client;

import lombok.Data;

/**
 * Сохранённый профиль клиента (альт-аккаунт).
 * <p>
 * Это чистая модель данных: аккаунт не знает ни про UI, ни про хранилище.
 * Хранилище и бизнес-логика — в {@code AccountStorage}, отрисовка — в Alt Manager.
 *
 * @see fun.crickclient.api.storages.implement.AccountStorage
 */
@Data
public class ClientAccount {

    /** Стабильный идентификатор аккаунта (UUID). */
    private String id;
    /** Игровой ник (уникален в рамках хранилища). */
    private String username;
    /** Timestamp создания (для сортировки списка). */
    private long createdAt;

    public ClientAccount() {
    }

    public ClientAccount(String id, String username, long createdAt) {
        this.id = id;
        this.username = username;
        this.createdAt = createdAt;
    }
}
