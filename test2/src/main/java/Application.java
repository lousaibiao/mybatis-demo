import com.lou.mybatis.model.Account;
import com.lou.mybatis.model.enums.AccountType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {

    }

    private static void enumTest() {
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account();
        account1.setAccountType(AccountType.Normal);
        Account account2 = new Account();
        account2.setAccountType(AccountType.Advanced);
        Account account3 = new Account();
        account3.setAccountType(AccountType.Normal);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        List<Account> normalAccount = accounts.stream().filter(account -> account.getAccountType() == AccountType.Normal).collect(Collectors.toList());
        System.out.println(normalAccount);


        System.out.println(AccountType.values());
        for (AccountType type : AccountType.values()) {
            System.out.println(type);
        }

        AccountType accountType = AccountType.Advanced;
        System.out.println(accountType.getTypeDesc());

        EnumSet<AccountType> accountTypes = EnumSet.of(AccountType.Normal, AccountType.Advanced);
        System.out.println(accountTypes);

        //key是枚举
        EnumMap<AccountType, List<Account>> typeGroup = new EnumMap(AccountType.class);
        EnumMap<AccountType, Account> typeGroup2 = new EnumMap(AccountType.class);

    }
}
