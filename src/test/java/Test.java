import com.example.repository.PersonnelInformationRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @Description
 * @Author 雷超
 * @Date on 2017/8/14 0014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication()
@WebAppConfiguration
public class Test {

    @Autowired
    private PersonnelInformationRepository personnelInformationRepository;

    @org.junit.Test
    public void test1() {

        List<PersonnelInformation> personnelInformations = personnelInformationRepository.findAll();

        for (PersonnelInformation personnelInformation : personnelInformations) {
            System.out.println(personnelInformation.personnelName + " :name");
        }

    }

}
