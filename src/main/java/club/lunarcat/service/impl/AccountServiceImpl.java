package club.lunarcat.service.impl;

import club.lunarcat.service.IAccountService;

/**
 * @aothor cds
 * @create 2019/10/10 - 20:05
 */
public class AccountServiceImpl implements IAccountService {
	@Override
	public void saveAccount() {
		System.out.println("执行了保存");
	}

	@Override
	public void updateAccount(int i) {
		System.out.println("执行了更新"+i);

	}

	@Override
	public int deleteAccount() {
		System.out.println("执行了删除");
		return 0;
	}
}
