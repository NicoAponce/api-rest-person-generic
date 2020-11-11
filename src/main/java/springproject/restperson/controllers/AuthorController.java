package springproject.restperson.controllers;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import springproject.restperson.controllers.base.BaseControllerImpl;import springproject.restperson.implementations.AuthorServiceImpl;import springproject.restperson.models.entities.Author;@RestController@RequestMapping("/api/authors")public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl> {}