/* 注：これはＣ言語のプログラムです。*/

#include <stdio.h>

int main(void)
{
	int i;

	for (i = 1; i <= 4; i++) {
		printf("%*d\n", i, 5);	/* 整数値5をi桁で表示 */
	}
	return 0;
}
