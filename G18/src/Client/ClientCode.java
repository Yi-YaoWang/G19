package Client;

public class ClientCode
{
    public static void main(String[] argv)
    {
        new ClientThreadCode("192.168.1.104", 8000).start();//�إߪ���A�ǤJIP�MPort�ð��浥�ݱ����s�u���ʧ@
        //�ѩ󦹽d�ҳ��b�ۤv�q���W����A�ҥHIP�]�w��127.0.0.1
    }
}