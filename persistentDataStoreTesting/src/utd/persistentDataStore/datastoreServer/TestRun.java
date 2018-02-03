package utd.persistentDataStore.datastoreServer;

public class TestRun {
	
	public static void main(String args[]) {
		DatastoreClientTestCase test = new DatastoreClientTestCase();
		
		try {
			test.testWrite();
			test.testWrite2();
			test.testRead();
			test.testReadBroken();
			test.testDelete();
			test.testDeleteBroken();
			test.testDirectory();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
