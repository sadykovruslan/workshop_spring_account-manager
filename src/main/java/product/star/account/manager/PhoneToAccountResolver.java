package product.star.account.manager;

import java.util.Optional;

public interface PhoneToAccountResolver {
    Optional<Account> findAccountByPhoneNumber(String phoneNumber);
    void addMapping (String phoneNumver, Account account);
    void removeMapping (String phoneNumber);
}
