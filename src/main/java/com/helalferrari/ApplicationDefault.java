package com.helalferrari;

import io.smallrye.jwt.build.Jwt;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.jwt.Claims;

import java.util.Arrays;
import java.util.HashSet;

@ApplicationPath("api")
public class ApplicationDefault extends Application {
}
