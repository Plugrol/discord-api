package de.kissenpvp.discord.api.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME)
public @interface DiscordCommand
{
    String command();

    String description() default "No description.";
}