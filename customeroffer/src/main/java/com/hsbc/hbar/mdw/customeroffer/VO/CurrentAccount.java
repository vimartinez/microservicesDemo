package com.hsbc.hbar.mdw.customeroffer.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentAccount {
	private Long id;
	private Long clientNumber;
	private Float balance;

}
