package zoneddatetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//��ȡ��ǰĬ��ʱ�������ں�ʱ��
		ZonedDateTime now=ZonedDateTime.now();
		System.out.println(now);
		//��ӡʱ��
		System.out.println(now.getZone());
		//��ȡinstant
		Instant ins=now.toInstant();
		System.out.println(ins.getEpochSecond());
		//��ָ��ʱ����ȡ��ǰ���ں�ʱ��
		ZonedDateTime london=ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(london);
		//���׶�ʱ��ת����ŦԼʱ��
		ZonedDateTime newyork=london.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(newyork);
	}

}
