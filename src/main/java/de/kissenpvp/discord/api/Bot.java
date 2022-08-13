/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package de.kissenpvp.discord.api;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.discord.api.command.SlashCommandDescription;
import org.javacord.api.entity.server.Server;
import org.javacord.api.listener.GloballyAttachableListener;

/**
 * Main class for the best discord-bot that exists in the universe north-west of New Hanover at least.
 *
 * @author Taubsie
 * @since 1.0.0
 */
public interface Bot extends Implementation {
    void stop();

    void restart();

    void reloadBot();

    void reloadConfig();

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    boolean isEnabled();

    boolean isConnected();

    Server getServer();

    void registerListener(GloballyAttachableListener globallyAttachableListener);

    void addCommand(SlashCommandDescription slashCommandDescription);
}